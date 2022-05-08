import Barchat from "components/Barchat";
import Datatable from "components/DataTable";
import Donutchat from "components/DonutChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";
import React from "react";

function Dashboard() {
    return (
        <>
            <NavBar />
            <div className="container">
                <h1 className="text-primary py-3">Dashboard de vendas</h1>

                <div className="row px-">
                    <div className="col-sm-6">
                        <h5 className="text-center text-secudary">Taxa de sucesso (%)</h5>
                        <Barchat />
                    </div>
                    <div className="col-sm-6">
                        <h5 className="text-center text-secudary">Taxa de sucesso (%)</h5>
                        <Donutchat />
                    </div>
                </div>
                <Datatable />
            </div>
            <Footer />
        </>
    );
}

export default Dashboard;