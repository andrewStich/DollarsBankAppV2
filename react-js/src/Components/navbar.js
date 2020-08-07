
import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import {Navbar, Nav} from 'react-bootstrap';
import {Link} from 'react-router-dom';


class NavBar extends React.Component {

    render() {
        if(URL.toString!="http://localhost:3000") {
            return  ( <div>
                <Navbar fixed="top" bg="dark" expand="lg">
                <Navbar.Brand className="text-light" as={Link} to="/"><img src="./bankLogo.png" alt="dollar bank logo"/></Navbar.Brand>
                <Navbar.Toggle aria-controls="basic-navbar-nav" />
                <Navbar.Collapse id="basic-navbar-nav">
                    <Nav className="mr-auto">
                        <Nav.Link className="text-light" as={Link} to="/home">Home</Nav.Link>
                        <Nav.Link className="text-light" as={Link} to="/account">Account</Nav.Link>
                        <Nav.Link className="text-light" as={Link} to="/checking">Checking</Nav.Link>
                        <Nav.Link className="text-light" as={Link} to="/savings">Savings</Nav.Link>
                    </Nav>
                </Navbar.Collapse>
                </Navbar>
                </div>
            );
        }
    }
}

export default NavBar;