package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class BrandEssentialsHslColorValue {
  /**
   * **BETA** Hue component of the HSL color space.
   */
  @com.google.gson.annotations.SerializedName("hue")
  private ch.brix.gql.client.frontify.scalars.FloatScalar hue;
  /**
   * **BETA** Saturation component of the HSL color space.
   */
  @com.google.gson.annotations.SerializedName("saturation")
  private ch.brix.gql.client.frontify.scalars.FloatScalar saturation;
  /**
   * **BETA** Lightness component of the HSL color space.
   */
  @com.google.gson.annotations.SerializedName("lightness")
  private ch.brix.gql.client.frontify.scalars.FloatScalar lightness;
}
