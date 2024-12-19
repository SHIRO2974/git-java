package chapter10.Practice;

import javax.swing.*;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

// InventorySystem: 재고 관리
public class InventorySystem {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("===== InventorySystem ====");
            System.out.println("1. Add Book");
            System.out.println("2. List All Book");
            System.out.println("3. Search Book");
            System.out.println("4. Search by Category");
            System.out.println("5. Search by price Range");
            System.out.println("6. Update Stick");
            System.out.println("7. Remove Book");
            System.out.println("8. Exit");
            System.out.println("Select an option: ");

            try {
                //scan.nextLine();
                // 입력값이 문자열로 인식

                // Integer.parseInt(데이터):
                // 데이터를 분석하여 Int 형태로 변경
                // 숫자 형태로 변경할 수 없는 값이 입력되는 경우 NumberFormatException 예외 발생
                int choice = Integer.parseInt(scan.nextLine());

                switch (choice) {

                    case 1:
                        System.out.print("Enter Book ID: ");
                        String id = scan.nextLine();

                        System.out.print("Enter Book title : ");
                        String title = scan.nextLine();

                        System.out.print("Enter Book ISBN : ");
                        String isbn = scan.nextLine();

                        System.out.print("Enter Book author: ");
                        String author = scan.nextLine();

                        System.out.print("Enter Book publisher: ");
                        String publisher = scan.nextLine();


                        System.out.print("Enter Book publish year: ");
                        int year = Integer.parseInt(scan.nextLine());

                        System.out.print("Enter price: ");
                        int price = Integer.parseInt(scan.nextLine());

                        System.out.print("Enter stock Quantity: ");
                        int stock = Integer.parseInt(scan.nextLine());

                        System.out.print("Enter category: ");
                        String category = scan.nextLine();

                        manager.add(new Book(id, title, isbn, author, publisher, year, price, stock, category));
                        break;

                    case 2:
                        manager.listAll();
                        break;

                    case 3:
                        System.out.println("Enter search keyword");
                        String keyword = scan.nextLine();
                        List<Item> searchResults = manager.search(keyword);

                        if (searchResults.isEmpty()) {
                            System.out.println("No item found in keyword" + keyword);

                        } else {
                            for (Item item : searchResults) {
                                item.display();
                            }
                        }
                        break;

                    case 4:
                        System.out.println("Enter category: ");
                        String searchCategory = scan.nextLine();
                        List<Item> categoryResults = manager.searchByCategory(searchCategory);

                        if (categoryResults.isEmpty()) {
                            System.out.println("No item found in category" + searchCategory);

                        } else {

                            for (Item item : categoryResults) {
                                item.display();
                            }
                        }
                        break;

                    case 5:

                        System.out.println("Enter minimum price: ");
                        int minPrice = Integer.parseInt(scan.nextLine());

                        System.out.println("Enter maximum price: ");
                        int maxPrice = Integer.parseInt(scan.nextLine());

                        List<Item> priceResults = manager.searchByPriceRange(minPrice, maxPrice);

                        if (priceResults.isEmpty()) {

                            System.out.println("No items found in price range");

                        } else {
                            for (Item item : priceResults) {
                                item.display();
                            }
                        }

                        //    priceResults.forEach(Item::display);
                        break;

                    case 6:

                        System.out.println("Enter Book ID to update stock: ");
                        String updateId = scan.nextLine();

                        System.out.println("Enter quantity to add/subtract: ");
                        int quantity = Integer.parseInt(scan.nextLine());

                        manager.updateStock(updateId, quantity);
                        break;

                    case 7:
                        System.out.println("Enter Book ID to remove:");
                        String removerId = scan.nextLine();
                        manager.remove(removerId);
                        break;

                    case 8:
                        System.out.println("== Exiting == ");
                        return;

                    default:
                        System.out.println("Invalid option. Try again");
                }

            } catch (NumberFormatException e) {

                System.out.println("Please Enter a valid number.");

            } catch (NoSuchElementException e) {

                // 검색된 내용이 없을 경우 실행될 블럭
                System.out.println(e.getMessage());

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
