import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import {Route, Switch} from 'react-router-dom';
import NavBar from './components/navbar.js'
import Home from './components/home.js';
import Account from './components/account.js';
import Checking from './components/checking.js';
import Savings from './components/savings.js';
import Login from './login.js';
import Signup from './signup.js';

class Main extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            user:[]
        }
    }

    render() {
            return (
                <div className="App">
                    <header className="App-header">
                            <link
                            rel="stylesheet"
                            href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
                            integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
                            crossOrigin="anonymous"
                            />
                    </header>
                        <NavBar/>
                        <Switch>
                            <Route path="/home" component={Home}/>
                            <Route path="/account" component={Account} />
                            <Route path="/checking" component={Checking} />
                            <Route path="/savings" component={Savings} />
                        </Switch>
                </div>
            );
    }
}

export default Main;