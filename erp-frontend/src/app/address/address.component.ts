import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-address',
  templateUrl: './address.component.html',
  styleUrls: ['./address.component.css']
})
export class AddressComponent {

  private baseUrl: string = "http://localhost:8080/api/"
  street: string = '';
  city: string = '';
  neighborhood: string = '';
  state: string = '';
  country: string[] = [];
  selectInput: string[] = [];
  constructor(private http: HttpClient) {}

  submitForm() {
    const formData = {
      street: this.street,
      city: this.city,
      neighborhood: this.neighborhood,
      state: this.state,
      country: this.country,
      selectInput: this.selectInput
    };

    this.http.post(`${this.baseUrl}address`, formData).subscribe(response => {
      // Manipule a resposta do backend aqui, se necessário
      console.log(response);
    });
  }
}
