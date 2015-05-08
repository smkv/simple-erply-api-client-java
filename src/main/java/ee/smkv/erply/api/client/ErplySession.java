package ee.smkv.erply.api.client;

import java.util.Date;

public class ErplySession {

  private final String key;
  private final Date startDate;
  private final Date endDate;

  ErplySession(String key, Date startDate, Date endDate) {
    this.key = key;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public String getKey() {
    return key;
  }

  public Date getStartDate() {
    return startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public boolean isValid() {
    Date now = new Date();
    return StringUtils.notEmpty(key) && startDate != null && startDate.compareTo(now) <= 0 && endDate != null && endDate.compareTo(now) > 0;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("ErplySession{");
    sb.append("key='").append(key).append('\'');
    sb.append(", startDate=").append(startDate);
    sb.append(", endDate=").append(endDate);
    sb.append('}');
    return sb.toString();
  }
}
