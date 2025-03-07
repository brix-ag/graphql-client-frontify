package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class RgbaColor {
  /**
   * Red color channel value.
   */
  @com.google.gson.annotations.SerializedName("red")
  private ch.brix.gql.client.frontify.scalars.RgbColorChannelScalar red;
  /**
   * Green color channel value.
   */
  @com.google.gson.annotations.SerializedName("green")
  private ch.brix.gql.client.frontify.scalars.RgbColorChannelScalar green;
  /**
   * Blue color channel value.
   */
  @com.google.gson.annotations.SerializedName("blue")
  private ch.brix.gql.client.frontify.scalars.RgbColorChannelScalar blue;
  /**
   * Alpha channel value.
   */
  @com.google.gson.annotations.SerializedName("alpha")
  private ch.brix.gql.client.frontify.scalars.PercentScalar alpha;
}
