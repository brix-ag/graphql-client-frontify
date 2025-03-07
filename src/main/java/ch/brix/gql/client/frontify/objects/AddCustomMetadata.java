package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AddCustomMetadata {
  /**
   * List of the parent Ids where the new `CustomMetadata` values were added.
   */
  @com.google.gson.annotations.SerializedName("parentIds")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.scalars.IdScalar.class)
  private java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> parentIds;
}
