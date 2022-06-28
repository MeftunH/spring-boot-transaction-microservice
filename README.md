# Spring Boot Transaction Microservice
# on live:
```
https://spring-trans-microservice.herokuapp.com/
```

## Endpoints

#### 1-Save Transaction
url
```aidl
localhost:4444/api/v1/transaction
```
body 
```aidl
{
"userId": 1,
"productId":1
}
```
response
```aidl
{
"id": 2,
"userId": 1,
"productId": 1,
"createdAt": "2022-06-28T03:31:07.9430886"
}
```
 
#### 2-Get Transaction Of User
url
```aidl
localhost:4444/api/v1/transaction/1
```
body
```aidl
{
}
```
response
```aidl
[
	{
		"id": 1,
		"userId": 1,
		"productId": 1,
		"createdAt": "2022-06-28T03:26:54.558591"
	},
	{
		"id": 2,
		"userId": 1,
		"productId": 1,
		"createdAt": "2022-06-28T03:31:07.943089"
	}
]
```

#### 2-Delete Transaction
url
```aidl
localhost:4444/api/v1/transaction/1
```
body
```aidl
{
}
```
response
```aidl
[
]
```

### Basic Auth credentials
``` 
username: SecureKeyUsername!
password: SecureKeyPassword! 
 ```
