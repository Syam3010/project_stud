import React, { Component } from 'react'
import './CSS/todo.css'



class Form extends Component {
    constructor(props) {
        super(props)

        this.state = {
            Name: "",
            DOB: "",
            Class: "",
            Division:"",
            gender: "",


        }
        this.handleSubmit=this.handleSubmit.bind(this)
    }

    Namehandler = (event) => {
        this.setState({
            Name: event.target.value
        })
    }
    DOBhandler = (event) => {
        this.setState({
            lastName: event.target.value
        })
    }
    Classhandler = (event) => {
        this.setState({
            Class: event.target.value
        })
    }

    Divisionhandler = (event) => {
        this.setState({
            Division: event.target.value
        })
    }
    Genderhandler = (event) => {
      this.setState({
          Gender: event.target.value
      })
  }

    handleSubmit = (event) => {
        alert(`${this.state.Name} ${this.state.DOB}  Registered Successfully !!!!`)
        console.log(this.state);
        this.setState({
            Name: "",
            DOB: "",
            Class: '',
            Division: "",
            Gemder:"",
        })
     event.preventDefault()

    }




    render() {
        return (
            <div>

                <form onSubmit={this.handleSubmit}>
                    <h1>User Registration</h1>
                    <label>Name :</label> <input type="text" value={this.state.Name} onChange={this.Namehandler} placeholder="Name..." /><br />
                    <label>DOB :</label> <input type="date" value={this.state.DOB} onChange={this.DOBhandler} placeholder="Dob..." /><br />
                    <label> Class:</label> <input type="number" value={this.state.Class} onChange={this.Classhandler} placeholder="Class..." /><br />
                    <label>Divison :</label><select onChange={this.genderhandler} defaultValue="Select Gender">
                        <option defaultValue>Select Gender</option>
                        <option value="male">A</option>
                        <option value="female">B</option>
                        <option value="female">C</option>
                        <option value="female">D</option>

                    </select><br />
                    <label>Divison :</label><select onChange={this.genderhandler} defaultValue="Division">
                        <option defaultValue>Division</option>
                        <option value="male">Male</option>
                        <option value="female">Female</option>
                    </select><br />
                    <input type="submit" value="Submit" />
                </form>

            </div>

        )
    }
}

export default Form
