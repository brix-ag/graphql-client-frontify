package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteServiceApp_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** The input for removing a ServiceApp
   * Default value: null
   */
  public RootMutation_deleteServiceApp_Args input(ch.brix.gql.client.frontify.input_objects.DeleteServiceAppInput value) {
    _add_arg("input", value);
    return this;
  }
}
