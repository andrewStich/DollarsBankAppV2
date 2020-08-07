import React from "react";
import {Button, Container, Row, Col} from 'react-bootstrap';
import {Link} from 'react-router-dom';

class Signup extends React.Component {
    render() {
        return (
            <Container style={{marginTop:"25px", marginBottom:"25px"}}>
                <Row>
                    <Col className="rounded" style={{backgroundColor:"#007bff"}} md={{ span: 6, offset: 3 }}>
                        <form className="mr-auto" style={{marginTop:"10px"}}>
                            <h3 className="mr-auto text-center text-light">Sign Up</h3>

                            <div className="form-group">
                                <label className="text-light">First name</label>
                                <input type="text" className="form-control" placeholder="First name" />
                            </div>

                            <div className="form-group">
                                <label className="text-light">Last name</label>
                                <input type="text" className="form-control" placeholder="Last name" />
                            </div>

                            <div className="form-group">
                                <label className="text-light">Phone Number</label>
                                <input type="tel" className="form-control" placeholder="mobile" />
                            </div>

                            <div className="form-group">
                                <label className="text-light">Country</label>
                                <input type="text" className="form-control" placeholder="country" />
                            </div>

                            <div className="form-group">
                                <label className="text-light">User name</label>
                                <input type="text" className="form-control" placeholder="username" />
                            </div>

                            <div className="form-group">
                                <label className="text-light">Password</label>
                                <input type="password" className="form-control" placeholder="Enter password" />
                            </div>

                            <div className="form-group">
                                <label className="text-light">Verify Password</label>
                                <input type="password" className="form-control" placeholder="Verify password" />
                            </div>

                            <button type="submit" className="btn btn-primary btn-block">Sign Up</button>
                            <Button className="btn btn-primary btn-block" style={{marginBottom:"10px"}} as={Link} to="./login">Already registered</Button>
                        </form>
                    </Col>
                </Row>
            </Container>
        );
    }
}

export default Signup;