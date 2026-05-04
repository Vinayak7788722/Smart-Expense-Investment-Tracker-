<div className="chart-container">
  <div className="chart-title">Monthly Trend</div>

  <div style={{ height: "300px" }}>
    {data && <Line data={data} options={{ maintainAspectRatio: false }} />}
  </div>
</div>