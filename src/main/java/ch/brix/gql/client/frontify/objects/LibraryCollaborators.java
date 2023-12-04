package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class LibraryCollaborators {
  /**
   * `LibraryCollaboratorUserItems` list.
   */
  @com.google.gson.annotations.SerializedName("users")
  private ch.brix.gql.client.frontify.objects.LibraryCollaboratorUserItems users;
}
