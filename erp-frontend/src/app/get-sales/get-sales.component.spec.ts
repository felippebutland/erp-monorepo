import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetSalesComponent } from './get-sales.component';

describe('GetSalesComponent', () => {
  let component: GetSalesComponent;
  let fixture: ComponentFixture<GetSalesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GetSalesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GetSalesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
