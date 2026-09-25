package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class BrandEssentialsAdobeFontStyle implements ch.brix.gql.client.frontify.interfaces.BrandEssentialsFontStyle {
  /**
   * **BETA** The name of the font style.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * **BETA** The weight of the font style.
   */
  @com.google.gson.annotations.SerializedName("weight")
  private ch.brix.gql.client.frontify.scalars.IntScalar weight;
  /**
   * **BETA** Whether the font style is italic.
   */
  @com.google.gson.annotations.SerializedName("isItalic")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar isItalic;
  /**
   * **BETA** The Adobe Typekit ID.
   */
  @com.google.gson.annotations.SerializedName("kitId")
  private ch.brix.gql.client.frontify.scalars.StringScalar kitId;
}
