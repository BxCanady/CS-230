#Brandon Canady
# CS-230
# The Gaming Room - Software Design Document

## Summary of The Gaming Room Client and Software Requirements
The Gaming Room is a client that required a user authentication and management system to support their gaming platform. The primary goal was to develop a secure and scalable RESTful API that would allow users to log in, manage accounts, and perform actions based on their assigned roles. The client wanted an RBAC (Role-Based Access Control) system, where Admins could create and manage user accounts, Users could view their profiles, and Guests would have limited access. The software needed to implement Basic Authentication, secure REST endpoints, and a structured backend using Dropwizard, JAX-RS, and Jersey to handle requests efficiently.

## What I Did Well in Developing the Documentation
One of my strengths in developing this documentation was my structured approach to defining the system architecture, authentication mechanisms, and API endpoints. I ensured that all technical details were clear, concise, and well-organized. My documentation included diagrams, endpoint definitions, and role-based access specifications, making it easy for other developers to understand and implement the system. Additionally, I followed industry best practices by detailing error handling, security considerations, and future scalability options.

## How the Design Document Helped in Developing the Code
Creating the design document before diving into the implementation helped clarify requirements and eliminate ambiguity. By outlining the API endpoints, authentication flow, and role-based access structure, I had a well-defined roadmap for development. This reduced code refactoring and debugging time since I had already considered edge cases, such as unauthorized access and invalid data inputs. The document also served as a reference guide, ensuring that all team members and stakeholders had a common understanding of the system’s functionality.

## What I Would Revise and How I Would Improve It
If I were to revise any part of the design document, I would focus on improving the API versioning strategy. Instead of exposing the API at /gameusers, I would implement a versioned API such as /api/v1/gameusers, allowing for future upgrades without breaking existing integrations. Additionally, I would enhance error handling documentation, providing detailed response codes and examples to make debugging easier for developers. Finally, I would incorporate JWT authentication in the future instead of Basic Auth for better security and scalability.

## Interpreting and Implementing User Needs in the Software Design
Understanding and implementing user needs was a critical part of the software design process. By analyzing the client's requirements, I structured the system so that different user roles had appropriate access levels—Admins could modify users, while standard Users could only view their own data. This ensures data security and compliance with best practices. Considering user needs is essential because it directly impacts user experience, security, and system reliability. A system designed without user needs in mind would lead to poor accessibility, security risks, and a frustrating experience for both users and administrators.

## Approach to Software Design and Future Strategies
My approach to designing software involved breaking down the system requirements into modular components and implementing them using a security-first mindset. I used Domain-Driven Design (DDD) principles to separate concerns and ensure that each class had a well-defined responsibility. Moving forward, I would adopt techniques such as API-first development, where API specifications are created before implementation, ensuring consistency across the system. Additionally, I would integrate automated testing and CI/CD pipelines to streamline development and improve system reliability. By continuously refining these strategies, I can create robust, scalable, and maintainable software applications.


