package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class BrandEssentials {
  /**
   * **BETA** The color palettes of the brand essentials.
   */
  @com.google.gson.annotations.SerializedName("colorPalettes")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsColorPaletteItems colorPalettes;
  /**
   * **BETA** The font families of the brand essentials.
   */
  @com.google.gson.annotations.SerializedName("fontFamilies")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsFontFamilyItems fontFamilies;
}
