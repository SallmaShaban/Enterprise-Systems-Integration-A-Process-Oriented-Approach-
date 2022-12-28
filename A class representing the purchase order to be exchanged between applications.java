using System;

namespace MSMQSolution
{
	public class PurchaseOrder
	{
		public string Product { get; set; }
		public int Quantity { get; set; }
		public DateTime Date { get; set; }

		public PurchaseOrder()
		{
			Date = DateTime.Now;
		}
	
	}
}