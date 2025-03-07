package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class DateTimeRange {
  /**
   * Start `DateTime` of the range.
   */
  @com.google.gson.annotations.SerializedName("from")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar from;
  /**
   * End `DateTime` of the range.
   */
  @com.google.gson.annotations.SerializedName("to")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar to;
}
