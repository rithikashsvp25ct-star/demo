public class Day7 {

    static class Request {
        String name;
        String date;
        String reason;

        Request(String n, String d, String r) {
            this.name = n;
            this.date = d;
            this.reason = r;
        }

        void Approve() {
            System.out.println("Request Approved");
        }

        void Reject() {
            System.out.println("Request Rejected");
        }
    }

    static class LeaveRequest extends Request {

        public LeaveRequest(String n,  String d, String r) {
            super(n, d, r);
        }

        void ApproveLeaveRequest() {
            System.out.println("Leave Request Approved");
            System.out.println("Name : " + name);
            System.out.println("Date : " + date);
            System.out.println("Reason : " + reason);
        }
         
        void RejectLeaveRequest() {
            System.out.println("Leave Request Rejected");
            System.out.println("Name : " + name);
        }
    }

    static class OnDutyRequest extends Request {

        public OnDutyRequest(String n,  String d, String r) {
            super(n, d, r);
        }

        void ApproveOnDutyRequest() {
            System.out.println("On-Duty Request Approved");
            System.out.println("Name : " + name);
            System.out.println("Date : " + date);
            System.out.println("Reason : " + reason);
        }

        void RejectOnDutyRequest() {
            System.out.println("On-Duty Request Rejected");
            System.out.println("Name : " + name);
        }
    }

    public static void main(String[] args) {

        Request r = new Request("Rithikash","12.06.26", "Medical Leave");
        r.Approve();

        System.out.println();

        LeaveRequest lr = new LeaveRequest("Rithikash", "13.06.26", "Medical Leave");
        lr.ApproveLeaveRequest();

        System.out.println();

        Request r2 = new Request("Karthik", "14.06.26", "Personal Work");
        r2.Reject();

        System.out.println();

        OnDutyRequest od = new OnDutyRequest("Karthik", "15.06.26", "Personal Work");
        od.RejectOnDutyRequest();
    }
}