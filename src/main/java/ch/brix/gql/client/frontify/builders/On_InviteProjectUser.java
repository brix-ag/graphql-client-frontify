package ch.brix.gql.client.frontify.builders;

public class On_InviteProjectUser extends ch.brix.gql.client.TypeBuilder {
  public On_InviteProjectUser() {
    super(new ch.brix.gql.client.On("InviteProjectUser"));
  }
  /**
   * `Project` where `User` was invited to.
   */
  public On_InviteProjectUser project(InviteProjectUser_project callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
