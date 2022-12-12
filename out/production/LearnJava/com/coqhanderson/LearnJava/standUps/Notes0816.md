# DTOs: Data Transfer Objects

- EditResourceRequest (a class on its own)
  - has to be abstract
  - attributes need to be protected

- dto package
  - request 
    1. EditMemberRequest class
       - attributes need to be private
    2. NewRegistrationRequest
       - private attributes
    - response
    1. MemberResponse
        - private attributes

- predicate
  - true or false 
  - has a boolean method to test for a particular value
  - Predicate<String> checkName = (str) -> str != ...
  - need a lambda expression
  - lambda expression: a syntax for a SINGULAR function

- Stream is a form of functional programming
  - a form of declarative programming
- MemberResponse::new -> this is known as the method reference operator

- Enum:
  - provide the possible choice for attribute inputs