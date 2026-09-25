package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class BrandEssentialsColorRepresentations {
  /**
   * **BETA** The RGBA representation of the color.
   */
  @com.google.gson.annotations.SerializedName("rgba")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsRgbaColorRepresentation rgba;
  /**
   * **BETA** The HEX representation of the color, derived from its RGBA representation.
   */
  @com.google.gson.annotations.SerializedName("hex")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsHexColorRepresentation hex;
  /**
   * **BETA** The HSL representation of the color.
   */
  @com.google.gson.annotations.SerializedName("hsl")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsHslColorRepresentation hsl;
  /**
   * **BETA** The CMYK representation of the color.
   */
  @com.google.gson.annotations.SerializedName("cmyk")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsCmykColorRepresentation cmyk;
  /**
   * **BETA** The CMYK Coated representation of the color.
   */
  @com.google.gson.annotations.SerializedName("cmykCoated")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsCmykColorRepresentation cmykCoated;
  /**
   * **BETA** The CMYK Uncoated representation of the color.
   */
  @com.google.gson.annotations.SerializedName("cmykUncoated")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsCmykColorRepresentation cmykUncoated;
  /**
   * **BETA** The CMYK Newspaper representation of the color.
   */
  @com.google.gson.annotations.SerializedName("cmykNewspaper")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsCmykColorRepresentation cmykNewspaper;
  /**
   * **BETA** The LAB representation of the color.
   */
  @com.google.gson.annotations.SerializedName("lab")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsLabColorRepresentation lab;
  /**
   * **BETA** The Pantone representation of the color.
   */
  @com.google.gson.annotations.SerializedName("pantone")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsColorSystemRepresentation pantone;
  /**
   * **BETA** The Pantone Coated representation of the color.
   */
  @com.google.gson.annotations.SerializedName("pantoneCoated")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsColorSystemRepresentation pantoneCoated;
  /**
   * **BETA** The Pantone Uncoated representation of the color.
   */
  @com.google.gson.annotations.SerializedName("pantoneUncoated")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsColorSystemRepresentation pantoneUncoated;
  /**
   * **BETA** The Pantone CP representation of the color.
   */
  @com.google.gson.annotations.SerializedName("pantoneCp")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsColorSystemRepresentation pantoneCp;
  /**
   * **BETA** The Pantone Plastics representation of the color.
   */
  @com.google.gson.annotations.SerializedName("pantonePlastics")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsColorSystemRepresentation pantonePlastics;
  /**
   * **BETA** The Pantone Textile representation of the color.
   */
  @com.google.gson.annotations.SerializedName("pantoneTextile")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsColorSystemRepresentation pantoneTextile;
  /**
   * **BETA** The RAL representation of the color.
   */
  @com.google.gson.annotations.SerializedName("ral")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsColorSystemRepresentation ral;
  /**
   * **BETA** The NCS representation of the color.
   */
  @com.google.gson.annotations.SerializedName("ncs")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsColorSystemRepresentation ncs;
  /**
   * **BETA** The HKS representation of the color.
   */
  @com.google.gson.annotations.SerializedName("hks")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsColorSystemRepresentation hks;
  /**
   * **BETA** The 3M representation of the color.
   */
  @com.google.gson.annotations.SerializedName("threeM")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsColorSystemRepresentation threeM;
  /**
   * **BETA** The Oracal representation of the color.
   */
  @com.google.gson.annotations.SerializedName("oracal")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsColorSystemRepresentation oracal;
  /**
   * **BETA** The SCSS/LESS variable representation of the color.
   */
  @com.google.gson.annotations.SerializedName("cssVariable")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsColorSystemRepresentation cssVariable;
}
