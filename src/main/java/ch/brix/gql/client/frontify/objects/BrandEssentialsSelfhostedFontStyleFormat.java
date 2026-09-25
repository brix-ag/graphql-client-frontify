package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class BrandEssentialsSelfhostedFontStyleFormat {
  /**
   * **BETA** The format of the font file.
   */
  @com.google.gson.annotations.SerializedName("format")
  private ch.brix.gql.client.frontify.scalars.StringScalar format;
  /**
   * **BETA** The URL of the font file.
   */
  @com.google.gson.annotations.SerializedName("url")
  private ch.brix.gql.client.frontify.scalars.StringScalar url;
}
