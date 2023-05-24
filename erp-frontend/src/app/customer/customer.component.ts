import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent {
  private baseUrl: string = "http://localhost:8080/api/"
  name: string = '';
  cpf_cnpj: string = '';
  email: string = '';
  phone: string = '';
  options: string[] = [];
  selectedOptions: string[] = [];
  dropdownOpen: boolean = false;
  constructor(private http: HttpClient) {}

  fetchData() {
    try {
      if (this.options.length === 0) {
        this.http.get<string[]>(`${this.baseUrl}customers`).subscribe(data => {
          this.options = data;
          this.dropdownOpen = true;
        });
      } else {
        this.options = ["do nothing"];
      }
    } catch (error) {
      console.log(error);
    }

    if(this.options) {
      this.dropdownOpen = !this.dropdownOpen;
    }
  }

  toggleSelection(option: string) {
    const index = this.selectedOptions.indexOf(option);
    if (index > -1) {
      this.selectedOptions.splice(index, 1);
    } else {
      this.selectedOptions.push(option);
    }
  }

  isSelected(option: string): boolean {
    return this.selectedOptions.indexOf(option) > -1;
  }

  submitForm() {
    const formData = {
      name: this.name,
      cpf_cnpj: this.cpf_cnpj,
      email: this.email,
      phone: this.phone,
      selectedOptions: this.selectedOptions
    };

    this.http.post(`${this.baseUrl}customers`, formData).subscribe(response => {
      // Manipule a resposta do backend aqui, se necessário
      console.log(response);
    });
  }
}
