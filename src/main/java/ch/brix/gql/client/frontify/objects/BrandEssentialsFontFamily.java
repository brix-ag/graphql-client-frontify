package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class BrandEssentialsFontFamily {
  /**
   * **BETA** The unique identifier of the font family.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** The name of the font family.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * **BETA** The CSS name of the font family.
   */
  @com.google.gson.annotations.SerializedName("cssName")
  private ch.brix.gql.client.frontify.scalars.StringScalar cssName;
  /**
   * **BETA** The font provider.
   */
  @com.google.gson.annotations.SerializedName("provider")
  private ch.brix.gql.client.frontify.scalars.StringScalar provider;
  /**
   * **BETA** The font styles available for this font family.
   */
  @com.google.gson.annotations.SerializedName("fontStyles")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.BrandEssentialsFontStyle.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.BrandEssentialsFontStyle> fontStyles;
}
