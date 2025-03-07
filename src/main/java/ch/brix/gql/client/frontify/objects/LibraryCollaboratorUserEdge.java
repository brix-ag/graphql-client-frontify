package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class LibraryCollaboratorUserEdge {
  /**
   * `User` that has the least required permissions to collaborate on a `Library`.
   */
  @com.google.gson.annotations.SerializedName("node")
  private ch.brix.gql.client.frontify.interfaces.User node;
  /**
   * `User` role in the `Library`.
   */
  @com.google.gson.annotations.SerializedName("role")
  private ch.brix.gql.client.frontify.scalars.StringScalar role;
}
