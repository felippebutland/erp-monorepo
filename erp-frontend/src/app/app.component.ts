import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'erp-frontend';
  toggle(event: Event) {
    const element = event.target as HTMLElement;
    element.classList.toggle('open');
  }
}
