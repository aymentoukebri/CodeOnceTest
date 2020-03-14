import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TextDetectorComponent } from './text-detector.component';

describe('TextDetectorComponent', () => {
  let component: TextDetectorComponent;
  let fixture: ComponentFixture<TextDetectorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TextDetectorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TextDetectorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
