package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class BrandEssentialsCmykColorValue {
  /**
   * **BETA** Cyan component of the CMYK color space.
   */
  @com.google.gson.annotations.SerializedName("cyan")
  private ch.brix.gql.client.frontify.scalars.FloatScalar cyan;
  /**
   * **BETA** Magenta component of the CMYK color space.
   */
  @com.google.gson.annotations.SerializedName("magenta")
  private ch.brix.gql.client.frontify.scalars.FloatScalar magenta;
  /**
   * **BETA** Yellow component of the CMYK color space.
   */
  @com.google.gson.annotations.SerializedName("yellow")
  private ch.brix.gql.client.frontify.scalars.FloatScalar yellow;
  /**
   * **BETA** Black component of the CMYK color space.
   */
  @com.google.gson.annotations.SerializedName("black")
  private ch.brix.gql.client.frontify.scalars.FloatScalar black;
}
