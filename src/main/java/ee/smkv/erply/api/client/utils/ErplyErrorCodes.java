package ee.smkv.erply.api.client.utils;

import java.util.HashMap;
import java.util.Map;

public class ErplyErrorCodes {
    public static Map<Integer, String> mapping = new HashMap<Integer, String>() {{
        put(1000, "API is under maintenance, please try again in a couple of minutes.");
        put(1001, "Account not found.");
        put(1002, "Hourly request limit (by default 1000 requests) has been exceeded for this account. Please resume next hour.");
        put(1003, "Cannot connect to account database.");
        put(1005, "API call (input parameter 'request') not specified, or unknown API call.");
        put(1006, "This API call is not available on this account. (Account needs upgrading, or an extra module needs to be installed.)");
        put(1007, "Unknown output format requested; input parameter 'responseType' should be either 'JSON' or 'XML'.");
        put(1008, "Either a) database is under regular maintenance (please try again in a couple of minutes), or b) your application is not connecting to the correct API server. Make sure that you are using correct API URL: https://yourcustomercode.erply.com/api/. If your API URL is correct, it might be that your ERPLY account has been recently transferred between hosting environments and your local DNS cache is out of date (domain name yourcustomercode.erply.com is not being resolved to correct web server). Try flushing DNS cache in your computer, server, or application engine.");
        put(1009, "This API call requires authentication parameters (a session key, authentication key, or service key), but none were found.");
        put(1010, "Required parameters are missing. (Attribute 'errorField' indicates the missing input parameter.)");
        put(1011, "Invalid classifier ID, there is no such item. (Attribute 'errorField' indicates the invalid input parameter.)");
        put(1012, "A parameter must have a unique value. (Attribute 'errorField' indicates the invalid input parameter.)");
        put(1013, "Inconsistent parameter set (for example, both product and service IDs specified for an invoice row).");
        put(1014, "Incorrect data type or format. (Attribute 'errorField' indicates the invalid input parameter.)");
        put(1015, "Malformed request (eg. parameters containing invalid characters).");
        put(1016, "Invalid value. (Attribute 'errorField' indicates the field that contains an invalid value.)");
        put(1017, "Document has been confirmed and its contents and warehouse ID cannot be edited any more.");
        put(1020, "Bulk API call contained more than 100 sub-requests (max 100 allowed). The whole request has been ignored.");
        put(1021, "Another instance of the same report is currently running. Please wait and try again in a minute. (For long-running reports, API processes incoming requests only one at a time.)");
        put(1040, "Invalid coupon identifier ' such coupon has not been issued.");
        put(1041, "Invalid coupon identifier ' this coupon has already been redeemed.");
        put(1042, "Customer does not have enough reward points.");
        put(1043, "Employee already has an appointment on that time slot. Please choose a different start and end time for appointment.");
        put(1044, "Default length for this service has not been defined in Erply backend ' cannot suggest possible time slots.");
        put(1045, "Invalid coupon identifier ' this coupon has expired.");
        put(1046, "Sales Promotion ' The promotion contains multiple conflicting requirements or conditions, please specify only one.");
        put(1047, "Sales Promotion ' Promotion requirements or conditions not specified.");
        put(1048, "Sales Promotion ' The promotion contains multiple conflicting awards, please specify only one.");
        put(1049, "Sales Promotion ' Promotion awards not specified.");
        put(1050, "Username/password missing.");
        put(1051, "Login failed.");
        put(1052, "User has been temporarily blocked because of repeated unsuccessful login attempts.");
        put(1053, "No password has been set for this user, therefore the user cannot be logged in.");
        put(1054, "API session has expired. Please call API 'verifyUser' again (with correct credentials) to receive a new session key.");
        put(1055, "Supplied session key is invalid; session not found.");
        put(1056, "Supplied session key is too old. User switching is no longer possible with this session key, please perform a full re-authentication via API 'verifyUser'.");
        put(1057, "Your time-limited demo account has expired. Please create a new ERPLY demo account, or sign up for a paid account.");
        put(1060, "No viewing rights (in this module/for this item).");
        put(1061, "No adding rights (in this module).");
        put(1062, "No editing rights (in this module/for this item).");
        put(1063, "No deleting rights (in this module/for this item).");
        put(1064, "User does not have access to this location (store, warehouse).");
        put(1065, "This user account does not have API access. (It may be limited to POS or Erply backend operations only.)");
        put(1071, "This customer can buy for a full up-front payment only.");
        put(1072, "This customer does not earn new reward points and cannot exchange reward points for coupons.");
        put(1080, "Printing service is not running at the moment. (User can turn printing service on from their Erply account).");
        put(1081, "E-mail sending failed.");
        put(1082, "E-mail sending has been incorrectly set up, review settings in ERPLY. (Missing sender's address or empty message content).");
        put(1090, "No file attached.");
        put(1091, "Attached file is not encoded with Base64.");
        put(1092, "Attached file exceeds allowed size limit.");
    }};

    public static String getErrorMessage(Integer code) {
        if (code != null) {
            return mapping.containsKey(code) ? mapping.get(code) : code.toString();
        } else {
            return null;
        }
    }
}
