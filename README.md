#springboot-load-balancing-microservices 

* Load balancing improves the distribution of work loads across multiple computing resources.
* There are two types of load balancer:
    1. Client side load balancer
    2. Server side load balancer
    
* Netflix Ribbon
* @LoadBalanced RestTemplate

* In intellij idea we can run the multiple instance of doctor service by clicking on the dropdown on top right dropdown with application name. Then click on `edit configuration`, then click on `copy configuration` icon at the top left to copy the configuration and modify the name of application.In my case I have created 3 instance of doctor service.
  The name of 3 instances are `DoctorServiceApplication`,`DoctorServiceApplication-9082` and `DoctorServiceApplication-9083`. We have to provide program argument on the new instance with value as server port.
    > --server.port=9082  for DoctorServiceApplication-9082
    > 
    > --server.port=9083  for DoctorServiceApplication-9083
  
* Then we have to run the all instance of doctor service.
* The execute doctor-portal doctors endpoint on browser:
  > http://localhost:7081/doctors
  

* When we hit the above url we got result from 9081 port of doctor service. If we refresh the page it wil get result from 9082 port and again refresh we get result from 9083. If we again refresh the page we get result from again 9081 and soon with increasing counter.