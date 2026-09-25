package ch.brix.gql.client.frontify.builders;

public class RootMutation_createServiceApp_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** The input required to create a ServiceApp
   * Default value: null
   */
  public RootMutation_createServiceApp_Args input(ch.brix.gql.client.frontify.input_objects.CreateServiceAppInput value) {
    _add_arg("input", value);
    return this;
  }
}
