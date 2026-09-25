package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class BrandEssentialsColorSystemRepresentation {
  /**
   * **BETA** The human readable name of the color representation.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * **BETA** The value of the color representation, the name the color carries in the external color system as authored by the brand, for example `2955 C` or `RAL 5002`. The format is not enforced.
   */
  @com.google.gson.annotations.SerializedName("value")
  private ch.brix.gql.client.frontify.scalars.StringScalar value;
}
