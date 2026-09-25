package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class BrandEssentialsRgbaColorValue {
  /**
   * **BETA** Red component of the RGBA color space.
   */
  @com.google.gson.annotations.SerializedName("red")
  private ch.brix.gql.client.frontify.scalars.IntScalar red;
  /**
   * **BETA** Green component of the RGBA color space.
   */
  @com.google.gson.annotations.SerializedName("green")
  private ch.brix.gql.client.frontify.scalars.IntScalar green;
  /**
   * **BETA** Blue component of the RGBA color space.
   */
  @com.google.gson.annotations.SerializedName("blue")
  private ch.brix.gql.client.frontify.scalars.IntScalar blue;
  /**
   * **BETA** Alpha component of the RGBA color space.
   */
  @com.google.gson.annotations.SerializedName("alpha")
  private ch.brix.gql.client.frontify.scalars.FloatScalar alpha;
}
