package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class Copyright {
  /**
   * Asset `copyright` status.
   */
  @com.google.gson.annotations.SerializedName("status")
  private ch.brix.gql.client.frontify.enums.CopyrightStatus status;
  /**
   * Asset `copyright` notice.
   */
  @com.google.gson.annotations.SerializedName("notice")
  private ch.brix.gql.client.frontify.scalars.StringScalar notice;
}
