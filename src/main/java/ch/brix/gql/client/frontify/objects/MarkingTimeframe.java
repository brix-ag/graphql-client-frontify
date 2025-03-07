package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class MarkingTimeframe {
  /**
   * The start of the `Marking` area in percentage of total video length.
   */
  @com.google.gson.annotations.SerializedName("start")
  private ch.brix.gql.client.frontify.scalars.PercentScalar start;
  /**
   * The end of the `Marking` area in percentage of total video length.
   */
  @com.google.gson.annotations.SerializedName("end")
  private ch.brix.gql.client.frontify.scalars.PercentScalar end;
}
