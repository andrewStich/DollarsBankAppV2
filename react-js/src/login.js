
import React, { Component } from 'react';
import {Link} from 'react-router-dom';
import {Button, Container, Row, Col} from 'react-bootstrap';

class Login extends Component {
    handleSubmit() {
        
    }

    render() {
        return (
            <Container style={{marginTop:"75px"}}>
                <Row>
                    <Col className="rounded" style={{backgroundColor:"#007bff"}} md={{ span: 6, offset: 3 }}>
                        <form className="mr-auto" style={{marginTop:"10px"}} onSubmit={handleSubmit()}>
                            <h3 className="mr-auto text-center">Sign In</h3>

                            <div className="form-group">
                                <label className="text-light">User name</label>
                                <input type="text" className="form-control" placeholder="Enter username" />
                            </div>

                            <div className="form-group">
                                <label className="text-light">Password</label>
                                <input type="password" className="form-control" placeholder="Enter password" />
                            </div>

                            <button type="submit" className="btn btn-primary btn-block">Submit</button>
                            <Button className="btn btn-primary btn-block" style={{marginBottom:"10px"}} as={Link} to="./signup">Signup</Button>
                        </form>
                    </Col>
                </Row>
            </Container>
        );
    }
}

export default Login;