package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class BrandEssentialsHexColorRepresentation {
  /**
   * **BETA** The human readable name of the color representation.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * **BETA** The value of the color representation, a hexadecimal color code in the uppercase form `#RRGGBB`, extended to `#RRGGBBAA` when the color is not fully opaque.
   */
  @com.google.gson.annotations.SerializedName("value")
  private ch.brix.gql.client.frontify.scalars.StringScalar value;
}
