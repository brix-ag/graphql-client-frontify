package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class InviteProjectUser {
  /**
   * `Project` where `User` was invited to.
   */
  @com.google.gson.annotations.SerializedName("project")
  private ch.brix.gql.client.frontify.unions.Project project;
}
