package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class RemoveCustomMetadata {
  /**
   * List of parentIds with removed `CustomMetadata` values.
   */
  @com.google.gson.annotations.SerializedName("parentIds")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.scalars.IdScalar.class)
  private java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> parentIds;
}
