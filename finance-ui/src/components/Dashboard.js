import ExpensePieChart from "./ExpensePieChart";
import SummaryCards from "./SummaryCards";

export default function Dashboard() {
  return (
    <div style={{ padding: "20px" }}>
      <h2>Finance Dashboard</h2>

      <SummaryCards />

      <div style={{
        display: "flex",
        justifyContent: "center",
        marginTop: "40px"
      }}>
        <ExpensePieChart />
      </div>

    </div>
  );
}