import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TextServiceService {

  constructor(private http: HttpClient) {}

  sendInput(text) {
    return this.http.post<any>('http://localhost:9010/ponctuation', text);
  }

}
