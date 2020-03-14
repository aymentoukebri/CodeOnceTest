import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup} from '@angular/forms';
import { TextServiceService } from '../text-service.service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-text-detector',
  templateUrl: './text-detector.component.html',
  styleUrls: ['./text-detector.component.css']
})
export class TextDetectorComponent implements OnInit {

  
  constructor(private fb: FormBuilder,  private textService: TextServiceService) {}
  
    Form: FormGroup;
    ponctuations: number;
  
    ngOnInit() {
      this.Form = this.fb.group({
        text: ''
      });
    }
  
    send() {
      this.textService.sendInput(this.Form.value).subscribe((res) => {
        this.ponctuations = res.ponctuations;
      });
  
    }
  

}
