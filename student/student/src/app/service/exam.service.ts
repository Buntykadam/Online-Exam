import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CandidateService {

  apiUrl:string="http://localhost:8097/Exam124";
  constructor(private http:HttpClient) { }

  
  getAll()
  {
    return this.http.get(`${this.apiUrl}`);
  }

  getById(id:any):Observable<any>
  {
    return this.http.get(`${this.apiUrl}/${id}`);
  }

  //To Add Candidates
  create(data:any):Observable<any>{
    let API = `${this.apiUrl}`;
    return this.http.post(API,data);
  }

  //To update candidate
  update(id:any,data:any):Observable<any>
  {
    return this.http.put(`${this.apiUrl}/${id}`,data);
  }


}