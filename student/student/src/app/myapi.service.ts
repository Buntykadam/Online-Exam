import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { User } from './user';
@Injectable({
  providedIn: 'root'
})
export class MyapiService {
  baseUrlS:string="http://localhost:8097/A";
  addNewUser(user: User) {
    return this.httpClient.post(this.baseUrlS + '/candidates', user);
  }

  constructor(private httpClient:HttpClient) { }
}
