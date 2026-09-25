package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class BrandEssentialsColor implements ch.brix.gql.client.frontify.interfaces.Node {
  /**
   * **BETA** The unique identifier of the color.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** The name of the color.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * **BETA** The description of the color.
   */
  @com.google.gson.annotations.SerializedName("description")
  private ch.brix.gql.client.frontify.scalars.StringScalar description;
  /**
   * **BETA** The different color representations available for the color.
   */
  @com.google.gson.annotations.SerializedName("representations")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsColorRepresentations representations;
}
