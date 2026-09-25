package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class BrandEssentialsHslColorRepresentation {
  /**
   * **BETA** The human readable name of the color representation.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * **BETA** The value of the color representation.
   */
  @com.google.gson.annotations.SerializedName("value")
  private ch.brix.gql.client.frontify.objects.BrandEssentialsHslColorValue value;
}
