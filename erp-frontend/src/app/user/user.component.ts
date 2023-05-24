import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent {
  private baseUrl: string = "http://localhost:8080/api/"
  name: string = '';
  password: string = '';
  profile: string = '';
  options: string[] = [];
  selectedOptions: string[] = [];
  dropdownOpen: boolean = false;
  constructor(private http: HttpClient) {}

  fetchData() {
    try {
      if (this.options.length === 0) {
        this.http.get<string[]>(`${this.baseUrl}profiles`).subscribe(data => {
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
      password: this.password,
      profile: this.profile
    };

    this.http.post(`${this.baseUrl}users`, formData).subscribe(response => {
      // Manipule a resposta do backend aqui, se necessário
      console.log(response);
    });
  }

}
