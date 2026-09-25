package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class BrandEssentialsLabColorValue {
  /**
   * **BETA** Lightness component of the LAB color space.
   */
  @com.google.gson.annotations.SerializedName("lightness")
  private ch.brix.gql.client.frontify.scalars.FloatScalar lightness;
  /**
   * **BETA** A axis component of the LAB color space.
   */
  @com.google.gson.annotations.SerializedName("aAxis")
  private ch.brix.gql.client.frontify.scalars.FloatScalar aAxis;
  /**
   * **BETA** B axis component of the LAB color space.
   */
  @com.google.gson.annotations.SerializedName("bAxis")
  private ch.brix.gql.client.frontify.scalars.FloatScalar bAxis;
}
