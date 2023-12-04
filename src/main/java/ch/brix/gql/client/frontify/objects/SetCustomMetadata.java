package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class SetCustomMetadata {
  /**
   * List of parentIds with newly `CustomMetadata` values set.
   */
  @com.google.gson.annotations.SerializedName("parentIds")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.scalars.IdScalar.class)
  private java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> parentIds;
}
