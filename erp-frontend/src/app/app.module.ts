import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { ReactiveFormsModule } from '@angular/forms';
import { AddressComponent } from './address/address.component';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerComponent } from './customer/customer.component';
import { SalesComponent } from './sales/sales.component';
import { SideBarComponent } from './side-bar/side-bar.component';
import { UserComponent } from './user/user.component';
import { ProductsComponent } from './products/products.component';
import { ReportsComponent } from './reports/reports.component';
import { GetSalesComponent } from './get-sales/get-sales.component';

@NgModule({
  declarations: [
    AppComponent,
    SideBarComponent,
    UserComponent,
    CustomerComponent,
    AddressComponent,
    SalesComponent,
    ProductsComponent,
    ReportsComponent,
    GetSalesComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
