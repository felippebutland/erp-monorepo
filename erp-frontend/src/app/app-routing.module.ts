import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddressComponent } from './address/address.component';
import { CustomerComponent } from './customer/customer.component';
import { GetSalesComponent } from './get-sales/get-sales.component';
import { ProductsComponent } from './products/products.component';
import { ReportsComponent } from './reports/reports.component';
import { SalesComponent } from './sales/sales.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [
  { path: 'customer', component: CustomerComponent },
  { path: 'address', component: AddressComponent },
  { path: 'sales', component: SalesComponent },
  { path: 'user', component: UserComponent },
  { path: 'products', component: ProductsComponent },
  { path: 'reports', component: ReportsComponent },
  { path: 'get-sales', component: GetSalesComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
