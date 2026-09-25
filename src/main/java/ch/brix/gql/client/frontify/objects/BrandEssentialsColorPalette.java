package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class BrandEssentialsColorPalette implements ch.brix.gql.client.frontify.interfaces.Node {
  /**
   * **BETA** The unique identifier of the color palette.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** The name of the color palette.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * **BETA** The description of the color palette.
   */
  @com.google.gson.annotations.SerializedName("description")
  private ch.brix.gql.client.frontify.scalars.StringScalar description;
  /**
   * **BETA** `DateTime` of the color palette creation.
   */
  @com.google.gson.annotations.SerializedName("createdAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar createdAt;
  /**
   * **BETA** The colors included in the color palette.
   */
  @com.google.gson.annotations.SerializedName("colors")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsColorItems colors;
}
